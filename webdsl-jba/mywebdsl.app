module mywebdsl

define dslinit(){
	includeCSS("bootstrap-3.3.2-dist/css/bootstrap.css")
	includeCSS("mycss/style.css")
	includeCSS("mycss/blog.css")
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
          navigate(root()){<a class="blog-nav-item active">"Home"</a>}
          navigate(page_login()){<a class="blog-nav-item">"About"</a>}
		  navigate(page_about()){<a class="blog-nav-item">"Login"</a>}
        </nav>
      </div>
    </div>
}


define dslblogpost(){
	<div class="blog-post">
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
	</div>
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
            <p>"This is a course project on "<em>"CISC 836"</em></p>
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
      <p>"Blog template built for" <a href="http://getbootstrap.com">"Bootstrap"</a> "by" <a href="https://twitter.com/mdo">"@mdo"</a>"."</p>
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
		<h2 class="form-signin-heading">"Please sign in"</h2>
		<label for="inputUser" class="sr-only">"Username"</label>
		input(name)
		<label for="inputPassword" class="sr-only">"Password"</label>
		input(pass)
	}
}