// disables the form input and other fields
let input_disabler = ()=>{
    let inputs = document.querySelectorAll('form')[0]
    for (let index = 0; index < inputs.length; index++) {
        inputs[index].disabled = true
        
    }
}
//setting submit event listner to the form
document.querySelector('#main-form').addEventListener('submit',(e)=>{
    // preventing the default behaviour of the form
    e.preventDefault()
    e.stopPropagation()
    let gender = 'Male'
    let name = `${document.querySelector('#fname').value} ${document.querySelector('#lname').value}`
    let email = document.querySelector('#email').value
    let address = document.querySelector('#address').value
    let pno = document.querySelector('#pno').value
    let male = document.querySelector('#male').checked
    if(!male){
        gender = 'Female'
    }
    let select = document.querySelector('#select-option').value
    let txtarea = document.querySelector('#remark').value;
    const details = {
        name,
        email,
        address,
        pno,
        gender,
        select,
        txtarea
    }
    document.querySelector('#spinner').style.display = "block"
    document.querySelector('form').style.opacity = '0.5'
    input_disabler()
    // mimicing the server post request
    setTimeout(() => {
         printTable(details)
    }, 1000);
})
// function to print the details table 
function printTable(details){
    document.querySelector('body').innerHTML = `<div class="result " id="result">
    <h1 class="text-center text-danger">Form Details</h1> 
    <table class="table table-bordered">
        <tbody class="p-3">
            <tr>
                <td scope="row">Name</td>
                <td scope="row">${details.name}</td>
            </tr>
            <tr>
                <td scope="row">Email</td>
                <td scope="row">${details.email}</td>
            </tr>
            <tr>
                <td scope="row">Address</td>
                <td scope="row">${details.address}</td>
            </tr>
            <tr>
                <td scope="row">Phone Number</td>
                <td scope="row">${details.pno}</td>
            </tr>
            <tr>
                <td scope="row">Gender</td>
                <td scope="row">${details.gender}</td>
            </tr>
            <tr>
                <td scope="row">Select</td>
                <td scope="row">You have selected ${details.select}</td>
            </tr>
            <tr>
                <td scope="row">Remark</td>
                <td scope="row">${details.txtarea}</td>
            </tr>
        </tbody>
    </table>
    <button class="btn btn-primary m-t-3 " id="print" onclick="window.print()">Print</button>
    
  </div>`
  
}