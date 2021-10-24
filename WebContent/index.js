fetch('http://localhost:8080/web/restservice/good')
  .then(function(response) {
    return response.json();
  })
  .then(function(myJson) {
    console.log(myJson);
    
    for(var i=0;i<myJson.length;i++){
    	var tr = document.createElement('tr');
    	var good_name = document.createElement('td');
    	var good_price = document.createElement('td');
    	var good_nums = document.createElement('td');
    	var good_type = document.createElement('td');
    	var good_department = document.createElement('td');
    	good_name.innerHTML=myJson[i].good_name;
    	good_price.innerHTML=myJson[i].good_price;
    	good_nums.innerHTML=myJson[i].good_nums;
    	good_type.innerHTML=myJson[i].good_type;
    	good_department.innerHTML=myJson[i].good_department;
    	tr.appendChild(good_name);
    	tr.appendChild(good_price);
    	tr.appendChild(good_nums);
    	tr.appendChild(good_type);
    	tr.appendChild(good_department);
        document.getElementById('showdata').appendChild(tr);
    }
});

function addgood(){
	var name = document.getElementById('good_name').value;
	var price = document.getElementById('good_price').value;
	var nums = document.getElementById('good_nums').value;
	var department = document.getElementById('good_department').value;
	console.log(name,price,nums,department);
}

