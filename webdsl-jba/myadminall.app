module myadminall
/*
  After login, this pages appear for admin files.
*/

entity MyArticle{
	Title   :: String
	Content :: Text
	Author  :: String
	CreateTime :: String
}

define page page_admin_welcome(admin : Admin){
	/*
	for(u:Admin){
		"name is " output(u.Username)
		"<br />"
		"pass is " output(u.Password)
	}separated-by{ <br />  }
	*/
	//var test := MyArticle{Title := "This is Yu"}
	//output(test.Title)
	navigate(page_admin_index()){"Enter Admin Console"}
	form{
		submit signout(){"Log Out"}
	}action signout(){
		log("Log in as ");
		log("securityContext.principal.name");
		securityContext.principal := null;
		return page_login();
	}
}

define page page_admin_index(){
	dslinit()
	var u : MyArticle
	var x : Text
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
	form[class="center"]{
		label("input")
		input(x)[class="form-control",rows="10"]
		<br />
		
		<div class="buttonLeft">
			submit saveContent()[class="btn btn-sm btn-primary btn-block"]{"Save"}
		</div>
		
		<div class="buttonRight">
			submit clearContent()[class="btn btn-sm btn-danger btn-block"]{"Cancel"}
		</div>
	}
	action saveContent(){
		var u0 := MyArticle{
			Content := x
		}.save();
	}
	action clearContent(){
		// clear
	}
}

define table_content(){
	t{
		r{
			th{""}
			th{"#"}
			th{"Title"}
			th{"Author"}
			th{"Added Time"}
			th{""}
		}		
		r{
			c{<button class="btn btn-xs btn-primary">"Edit"</button>}
			c{"1"}
			c{"good day good day good day good day ..."}
			c{"wukefe"}
			c{"March xx, 2015"}
			c{<button class="btn btn-xs btn-danger">"Del"</button>}
		}
		r{
			c{<button class="btn btn-xs btn-primary">"Edit"</button>}
			c{"2"}
			c{"good day good day good day good day ..."}
			c{"wukefe"}
			c{"March xx, 2015"}
			c{<button class="btn btn-xs btn-danger">"Del"</button>}
		}
		for (u : MyArticle){
			c{<button class="btn btn-xs btn-primary">"Edit"</button>}
			c{"xx"}
			c{output(u.Content)}
			c{"wukefe"}
			c{"April xx, 2015"}
			c{<button class="btn btn-xs btn-danger">"Del"</button>}
		}
	}
}
