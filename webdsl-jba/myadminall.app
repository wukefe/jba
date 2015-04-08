module myadminall
/*
  After login, this pages appear for admin files.
*/

entity MyArticle{
	Title   :: String
	Content :: WikiText
	Author  :: String
	CreateTime :: String
	count :: Int
}

define page page_admin_welcome(admin : Admin){
	/*for(u:Admin){
		"name is " output(u.Username)
		"<br />"
		"pass is " output(u.Password)
	}separated-by{ <br />  }
	navigate(page_admin_index()){"Enter Admin Console"}
	*/
	/*navigate(page_admin_index(admin)){"Enter Admin Console"}
	form{
		submit signout(){"Log Out"}
	}action signout(){
		log("Log in as ");
		log("securityContext.principal.name");
		securityContext.principal := null;
		return page_login();
	}*/
}



define page page_admin_index(admin : Admin, indx : Int){
	dslinit()
	var u : MyArticle
	var x : Text
	var utitle : WikiText
	var ucontent : WikiText
	var id : Int := 1
	
	
	var art : MyArticle := findArt(indx)
	
	action saveContent(){
		var ArticleList : List<MyArticle> := from MyArticle;
		var ucount : Int := ArticleList.length + 1;
		/*var u0 := MyArticle{
			Title := utitle
			Content := ucontent
			Author := admin.Username
			count := ucount
		}.save();*/
		if(art.count < 0) {
			art.count := ucount;
			art.save();
		}
		return table_content(admin, ucount);
	}
	action clearContent(){
		// clear
		art.Title := "";
		art.Content := "";
	}
	/*<div class="center">
		<h1>"Please input a markdown file"</h1>
		<p>
			label("Content")
			<textarea class="form-control" rows="5"></textarea>
		</p>
		<div class="buttonLeft">
			<button class="btn btn-sm btn-primary btn-block" onclick="saveContent()">"Save"</button>
		</div>
		<div class="buttonRight">
			<button class="btn btn-sm btn-danger btn-block" onclick="clearContent()">"Cancel"</button>
		</div>
		<br/>
		<hr></hr>
		table_content()
	</div>*/
<div class="row">
	page_left_bar(admin,findtotal()) //div-col-sm-1
	
	<div class="col-sm-8">
		<div class="center">
		form{
			<h2>"Writing..."</h2>
			<p>
				<label>"Title: "</label>
				input(art.Title)[class="form-control",rows="1",style="width:100%"]
			</p>
			label("Content")
			input(art.Content)[class="form-control",rows="15"]
			<br />
			
			<div class="buttonLeft">
				submit saveContent()[class="btn btn-sm btn-primary btn-block"]{"Save"}
			</div>
			
			<div class="buttonRight">
				submit clearContent()[class="btn btn-sm btn-danger btn-block"]{"Cancel"}
			</div>
		}
		</div>
	</div>
</div>
}

define page table_content(admin : Admin, len : Int){
	dslinit()
<div class="row">
	page_left_bar(admin, findtotal())
	
	<div class="col-sm-8">
	<div class="center">
	<h2>"Manage Articles"</h2>
	t{
		r{
			//th{""}
			th{"#"}
			th{"Title"}
			th{"Author"}
			th{"Added Time"}
			th{"Modified Time"}
			th{""}
		}
		for (u : MyArticle order by u.count asc){
			r{
				c{output(u.count)}
				c{output(u.Title)}
				c{output(u.Author)}
				c{output(u.created)}
				c{output(u.modified)}
				c[class="lastcell"]{
					form{
						submit action{ return page_view(u); }[class="btn btn-xs btn-primary margin",target="_blank"]{"View"}
						submit action{ return page_admin_edit(admin, u.count); }[class="btn btn-xs btn-primary margin"]{ "Edit" }
						submit action{ u.delete(); refreshID(); return table_content(admin, findtotal());}[class="btn btn-xs btn-danger margin"] { "Delete" }
					}
				 }
			}
		}
	}
	<p class="adminFoot">
		<a class="btn btn-lg btn-outline" href="#">"Total " output(findtotal()) " articles"</a>
	</p>
	/*form[class="center"]{
		submit action{ return page_admin_index(); } { "Go Back" }
	}*/
	</div>
   </div>
</div>   
}

function cut(s : String) : String{
	if (s.length() > 20){
		//cut string
		return s;
	}
	return s;
}

define d(){
	<div class="center">
		elements()
	</div>
}


define page_left_bar(admin : Admin, len : Int){
	
	var temp := MyArticle{
		Title := ""
	    Content := ""
	    Author  := ""
	    CreateTime := ""
	}
	
	action signout(){
		securityContext.principal := null;
		return page_login();
	}
	
	<div class="col-sm-1 col-sm-offset-1 blog-sidebar" align="center">
		<hr></hr>
		<div>
            <h4>"Administrator"</h4>
			<p><a>output(admin.Username)</a></p>
        </div>
		<hr></hr>
        <div>
            <h4>"Dashboard"</h4>
            navigate(page_admin_index(admin,-1)){"Publish Articles"}
            <br />
            navigate(table_content(admin,len)){"Manage Articles"}
            <br />
            navigate(root()){"Back to Home"}
        </div>
		  <hr></hr>
		  <div>
		  <h4>"Authors"</h4>
		    <ol class="list-unstyled">
              <li><a href="#">"Yu Zhao"</a></li>
			  <li><a href="#">"Hanfeng Chen"</a></li>
            </ol>
		  <i>"Supervised by Prof. Dingel in CISC 836"</i>
		  </div>
		  <hr></hr>
		  <div>
		  //<h4><a href="#">"Logout"</a></h4>
		  form{ submitlink signout(){"Log Out"} }
		  </div>
		  <hr></hr>
     </div>
}

function findArt(indx : Int) : MyArticle{
	var ArticleList : List<MyArticle> := from MyArticle;
	if (indx < 0) {
		return MyArticle{count:=-1};
	}
	return ArticleList[indx];
}

function findtotal() : Int{
	var ArticleList : List<MyArticle> := from MyArticle;
	return ArticleList.length;
}

function refreshID(){
	var cnt : Int := 1;
	for (u : MyArticle order by u.count asc){
		u.count := cnt;
		cnt := cnt + 1;
	}
}


define page page_admin_edit(admin : Admin, count : Int){
	dslinit()
	var u : MyArticle
	var x : Text
	var y : WikiText
	var z : Int 
	
	action saveContent(){
		for(article : MyArticle){
			if(count == article.count){
				article.Title := x;
				article.Content := y;
				var ArticleList : List<MyArticle> := from MyArticle;
				var len : Int := ArticleList.length;
				return table_content(admin,len);
			}
		}
		
	}
	action clearContent(){
		// clear
}	

<div class="row">
	page_left_bar(admin,z) //div-col-sm-1
	
	
	<div class="col-sm-8">
		<div class="center">
		form{
			<h2>"Writing..."</h2>
			<p>
				<label>"Title: "</label>
				input(x)[class="form-control",rows="1"]
			</p>
			label("Content")
			input(y)[class="form-control",rows="15"]
			<br />
			
			<div class="buttonLeft">
				submit saveContent()[class="btn btn-sm btn-primary btn-block"]{"Save"}
			</div>
			
			<div class="buttonRight">
				submit clearContent()[class="btn btn-sm btn-danger btn-block"]{"Cancel"}
			</div>
		}
		</div>
	</div>
	
</div>
}