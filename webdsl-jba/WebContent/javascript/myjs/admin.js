
function saveContent(){
	var title = getValue("mtitle");
	var content = getValue("mcontent");
	window.alert(title + " " + content);
}

function clearContent(){
	if((getValue("mtitle")!="" || getValue("mcontent")!="") && confirm("Clear the title and content?") == true){
		setValue("mtitle", "");
		setValue("mcontent", "");
	}
	else{
		//do nothing
	}
}

function getValue(id){
	return document.getElementById(id).value;
}

function setValue(id, v){
	document.getElementById(id).value = v;
}