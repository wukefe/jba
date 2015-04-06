application web_dsl_simple

description {
  First page
}

entity MyAdmin{
	Username :: String (name)
	Userpass :: Secret
}

entity Admin{
	Username :: String
	Password :: String
}

section pages
imports mywebdsl
imports myadminall
// access control rules

define page root(){
	main()
}

// no page_admin : name conflict
define page page_about(){
	main_login()
}

define page page_login(){
	dslinit()
	includeCSS("mycss/signin.css")
	var uname : String
	var upass : Secret
	
	form[class="form-signin"]{
		<h2 class="form-signin-heading">"Please sign in"</h2>
		<label for="inputUser" class="sr-only">"Administrator name"</label>
		//<input type="text" id="inputUser" class="form-control" placeholder="Administrator name" style="width:100%;"></input>
		input(uname)[type="text",id="inputUser",class="form-control",placeholder="Administrator name",style="width:100%;"]
		<label for="inputPassword" class="sr-only">"Password"</label>
		//<input type="password" id="inputPassword" class="form-control" placeholder="Password"></input>
		//input(name)
		//<button class="btn btn-lg btn-primary btn-block" type="submit">"Sign in"</button>
		input(upass)[class="form-control",id="inputPassword",placeholder="Password",type="password",style="width:100%;"]
		submit saveForm()[class="btn btn-lg btn-primary btn-block"]{"Sign in"}
	}
	action saveForm(){
		log("----");
		log(uname);
		log(upass);
		var u := MyAdmin{
			Username := uname
			Userpass := upass.digest()
		}.save();
		return page_admin_welcome();
	}
}

