module myadminall
/*
  After login, this pages appear for admin files.
*/

entity MyArticle{
	Title   :: String
	Content :: WikiText
	Author  :: String
	CreateTime :: String
}

define page page_admin_welcome(admin : Admin){
	/*for(u:Admin){
		"name is " output(u.Username)
		"<br />"
		"pass is " output(u.Password)
	}separated-by{ <br />  }
	navigate(page_admin_index()){"Enter Admin Console"}
	*/
	navigate(page_admin_index(admin)){"Enter Admin Console"}
	form{
		submit signout(){"Log Out"}
	}action signout(){
		log("Log in as ");
		log("securityContext.principal.name");
		securityContext.principal := null;
		return page_login();
	}
}

define page page_admin_index(admin : Admin){
	dslinit()
	var u : MyArticle
	var x : Text
	var y : WikiText
	
	action saveContent(){
		var u0 := MyArticle{
			Content := y
		}.save();
		return table_content(admin);
	}
	action clearContent(){
		// clear
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
	page_left_bar(admin) //div-col-sm-1
	
	<div class="col-sm-8">
		form[class="center"]{
			label("input")
			input(y)[class="form-control",rows="10"]
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
}

define page table_content(admin : Admin){
	dslinit()
<div class="row">
	page_left_bar(admin)
	
	<div class="col-sm-8">
	t{
		r{
			//th{""}
			th{"#"}
			th{"Title"}
			th{"Author"}
			th{"Added Time"}
			th{""}
		}		
		r{
			c{"1"}
			c{"good day good day good day good day ..."}
			c{"wukefe"}
			c{"March xx, 2015"}
			c{
				form{
					submit action{ }[class="btn btn-xs btn-primary margin"]{"View"}
					submit action{ }[class="btn btn-xs btn-primary margin"]{ "Edit" }
					submit action{ }[class="btn btn-xs btn-danger margin"] { "Delete" }
				}
			 }
		}
		r{
			c{"2"}
			c{"good day good day good day good day ..."}
			c{"wukefe"}
			c{"March xx, 2015"}
			c[class="lastcell"]{
				form{
					submit action{ }[class="btn btn-xs btn-primary margin"]{"View"}
					submit action{ }[class="btn btn-xs btn-primary margin"]{ "Edit" }
					submit action{ }[class="btn btn-xs btn-danger margin"] { "Delete" }
				}
			 }
		}
		for (u : MyArticle){
			r{
				c{"xx"}
				c{output(u.Content)}
				c{"wukefe"}
				c{"April xx, 2015"}
				c[class="lastcell"]{
					form{
						submit action{ return page_view(u); }[class="btn btn-xs btn-primary margin"]{"View"}
						submit action{ }[class="btn btn-xs btn-primary margin"]{ "Edit" }
						submit action{ }[class="btn btn-xs btn-danger margin"] { "Delete" }
					}
				 }
			}
		}
	}
	<p class="adminFoot">
		<a class="btn btn-lg btn-outline" href="#">"Total 2 articles"</a>
	</p>
	/*form[class="center"]{
		submit action{ return page_admin_index(); } { "Go Back" }
	}*/
   </div>
</div>   
}


define page page_view(u:MyArticle){
	d{
		output(u.Content)
	}
}

define d(){
	<div class="center">
		elements()
	</div>
}


define page_left_bar(admin : Admin){
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
            navigate(page_admin_index(admin)){"Publish Articles"}
            <br />
            navigate(table_content(admin)){"Manage Articles"}
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
		  form{ submit signout(){"Log Out"} }
		  </div>
		  <hr></hr>
     </div>
}