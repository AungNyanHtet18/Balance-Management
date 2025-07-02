document.addEventListener('DOMContentLoaded',() =>{
	 const addNewBtn =document.getElementById('addNewBtn')
	 const editDialog = new bootstrap.Modal('#editDialog')
	 
	 addNewBtn.addEventListener('click',()=>{
		
		document.getElementById('editFormTitle').innerText='Add New Category'
					
		 document.getElementById('id').value = null
		 document.getElementById('type').value = ''
		 document.getElementById('name').value = ''
		 document.getElementById('status').checked = false
		
		 editDialog.show()
	 })
	 
	 const statusCheck = document.getElementById('status')
	 const statusLabel = document.getElementById('statusLabel')
	 
	 statusCheck.addEventListener('change',()=>{
		
		//console.log(`Status Value : ${statusCheck.checked}`)
		
		 if(statusCheck.checked == true){
			 statusLabel.innerText='Deleted'
		 }else{
			 statusLabel.innerText='Active'
		 }

	 })
	 
	 
	 Array.from(document.getElementsByClassName('edit-link'))
	      .forEach(link => {
			link.addEventListener('click',(event) =>{
			event.preventDefault()
				
			document.getElementById('editFormTitle').innerText='Edit Category'
			
		     //console.log(`ID : ${link.dataset['editId']}`)	 
			 document.getElementById('id').value = link.dataset['editId']
			 document.getElementById('type').value = link.dataset['editType']
			 document.getElementById('name').value = link.dataset['editName']
			// console.log(`status : ${link.dataset['editStatus']}`)
			 document.getElementById('status').checked   = link.dataset['editStatus']
			 document.getElementById('statusLabel').innerText = link.dataset['editStatus'] ? 'Deleted' : 'Active'
			 
			 editDialog.show()
			
			}) 
		})
})