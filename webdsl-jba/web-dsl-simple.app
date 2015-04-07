application web_dsl_simple

description {
  First page
}

principal is Admin with credentials Username, Password
entity Admin{
	Username :: String
	Password :: String
}

section pages
imports mywebdsl
imports myadminall
// access control rules

init{
	var admin : Admin := Admin{Username := "Admin" Password := "Admin" };
	admin.save(); //save admin information into the database
}

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
		input(uname)[type="text",id="inputUser",class="form-control",placeholder="Administrator name",style="width:100%;"]
		<label for="inputPassword" class="sr-only">"Password"</label>
		input(upass)[class="form-control",id="inputPassword",placeholder="Password",type="password",style="width:100%;"]
		submit saveForm()[class="btn btn-lg btn-primary btn-block"]{"Sign in"}
	}
	action saveForm(){
		log("----");
		log(uname);
		log(upass);
		var AdminList : List<Admin> := from Admin;
		validate(authentica(uname,upass,AdminList[0]),"Sorry, wrong password or admin name");
		message("You are logged in!");
		return page_admin_welcome(AdminList[0]);
	}
}


function authentica(name: String, pass : String, u : Admin) : Bool{
	if(name == u.Username && u.Password == pass){
		securityContext.principal := u;
		return(true);
	}else{return(false);}
}

access control rules
//make sure only the admin can go into this page
rule page root(){
	true
}

rule page page_login(){
	true
}

rule page page_admin_index(){
	true
}

rule page page_about(){
	true
}

rule page page_admin_welcome(admin : Admin){
    admin == securityContext.principal	
}


