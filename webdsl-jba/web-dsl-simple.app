application web_dsl_simple

description {
  First page
}

principal is Admin with credentials Username, Password

entity Admin{
	Username :: String
	Password :: String
}

init{
	var admin : Admin := Admin{Username := "Admin" Password := "Admin" };
	admin.save(); //save admin information into the database
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

define page page_view(u : MyArticle){
	dslinit()
	dslheader()
	my_view_body(u)
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
		var AdminList : List<Admin> := from Admin;
		validate(authentica(uname,upass,AdminList[0]),"Sorry, wrong password or admin name");
		//return page_admin_welcome(AdminList[0]);
		return page_admin_index(AdminList[0],-1);
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

rule page page_about(){
	true
}

rule page page_view(u : MyArticle){
	true
}

rule page page_admin_welcome(admin : Admin){
    admin == securityContext.principal
}

rule page page_admin_index(admin : Admin, indx : Int){
	admin == securityContext.principal
}

rule page table_content(admin : Admin, len : Int){
	admin == securityContext.principal
}

rule page page_admin_edit(admin : Admin, count : Int){
	admin == securityContext.principal
}
