module mywebdsl

define dslinit(){
	includeCSS("bootstrap-3.3.2-dist/css/bootstrap.css")
	includeCSS("mycss/style.css")
	includeCSS("mycss/blog.css")
	includeJS("myjs/admin.js")
}

define main(){
	dslinit()
	dslheader()
	dslcontainer()
	dslfooter()
    
}

define dslheader(){
	<div class="blog-masthead">
      <div class="container">
        <nav class="blog-nav">
		  navigate(root())[class="blog-nav-item active"]{"Home"}
		  navigate(page_about())[class="blog-nav-item"]{"About"}
		  navigate(page_login())[class="blog-nav-item"]{"Login"}
        </nav>
      </div>
    </div>
}


define dslblogpost(){
	/*<div class="blog-post">
			<h2 class="blog-post-title">"Assignment 1"</h2>
			<p class="blog-post-meta">"March 13, 2015 by "<a href="#">"Hanfeng"</a></p>
			<h3>"This is assignment 1"</h3>

			<p>"Draw five diagrams"</p>
			
			<ol>
			<li>"it is a"</li>
			<li>"it is b"</li>
			<li>"it is c"</li>
			<li>"it is d"</li>
			<li>"it is e"</li>
			</ol>
	</div>*/
	for(u : MyArticle order by u.count desc){
		<div class="blog-post">
			//navigate(view_article(u))[class="blog-post-title"]{output(u.Title)}
			//<h2 class="blog-post-title">output(u.Title)</h2>
			form{ submitlink action{ return page_view(u); }[class="blog-post-title",target="_blank"]{output(u.Title)} }
			<p class="blog-post-meta">output(u.created) " by " <a>output(u.Author)</a></p>
			/*<h3>"test title"</h3>

			<div>
				output(u.Content)
			</div>*/
	</div>
	}
}

define dslcontainer(){
	<div class="container">
      <div class="blog-header">
        <h1 class="blog-title">"JBA - A Jekyll like Blog Application"</h1>
        <p class="lead blog-description">"CISC 836 course project - By Hanfeng Chen and Yu Zhao"</p>
      </div>
      <div class="row">
        <div class="col-sm-8 blog-main">
        	dslblogpost()
        </div>
        dslsidebar()
	  </div>
    </div>
}

define dslsidebar(){
	<div class="col-sm-3 col-sm-offset-1 blog-sidebar">
          <div class="sidebar-module sidebar-module-inset">
            <h4>"About"</h4>
            <p>"Final presentation: April 8, 2015"</p>
          </div>
          <div class="sidebar-module">
            <h4>"Archives"</h4>
            <ol class="list-unstyled">
              <li><a href="#">"March 2015"</a></li>
              <li><a href="#">"February 2015"</a></li>
            </ol>
          </div>
          <div class="sidebar-module">
            <h4>"Elsewhere"</h4>
            <ol class="list-unstyled">
              <li><a href="https://github.com/wukefe/jba" target="_blank">"GitHub"</a></li>
              <li><a href="#">"Twitter"</a></li>
              <li><a href="#">"Facebook"</a></li>
            </ol>
          </div>
        </div>
}

define dslfooter(){
	<footer class="blog-footer">
      <p>"Blog template built for" <a href="http://getbootstrap.com">"Bootstrap"</a> " by " <a href="https://twitter.com/mdo">"@mdo"</a>"."</p>
      <p>
        <a href="#">"Back to top"</a>
      </p>
    </footer>
}

define main_login(){
	includeCSS("mycss/signin.css")
	var name : String
	var pass : Secret
	
	
	form{
		label("Username:"){ input(name){ } }
		<br />
		label("Password:"){ input(pass) }
		<br />
		submitlink action{
			validate(name.length()>0, "Username required");
			validate(pass.length()>0, "Password required");
			return root();
		}{"Login file"}
    }
}

/*
define main_login(){
	includeCSS("mycss/signin.css")
	var name : String
	var pass : Secret
	
	Form{
		//<h2 class="form-signin-heading">"Please sign in"</h2>
		//<label for="inputUser" class="sr-only">"Username"</label>
		//input(name)
		//<label for="inputPassword" class="sr-only">"Password"</label>
		//input(pass)
		label("Username:"){input(name)}
		label("Password:"){input(pass)}
	}
	action save(){
		
	}
}
*/

/*
 for page_view
*/

define my_view_body(u : MyArticle){
	<div class="container">
		<div class="row">
		<div class="blog-post">
			<h2 class="blog-post-title-view">output(u.Title)</h2>
			<p class="blog-post-meta-view">output(u.created) " by " <a>output(u.Author)</a></p>
			<hr></hr>
			<div class="blog-view-format">
				output(u.Content)
			</div>
		</div>
		</div>
	</div>
}

define t(){
    <table class="table table-hover">
      elements()
    </table>
  }
define r(){
    <tr>
      elements()
    </tr>
  }
define c(){
    <td>
      elements()
    </td>
}

define th(){
	<th>
		elements()
	</th>
}