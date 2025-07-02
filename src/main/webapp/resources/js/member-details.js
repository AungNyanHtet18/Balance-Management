document.addEventListener('DOMContentLoaded',()=>{
	 
	 const statusChangeDialog = new bootstrap.Modal('#statusChangeDialog')
	 const statusChangeBtn = document.getElementById('statusChangeBtn')
	 
	 if(statusChangeDialog && statusChangeBtn){
		 statusChangeBtn.addEventListener('click',()=>{
			statusChangeDialog.show()
		 })
	 }
	 
})