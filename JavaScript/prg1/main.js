document.querySelector('.form').addEventListener('submit',(e)=>{
    console.log("in method")
    e.preventDefault();
    let name = element('.name');
    let rollno = element('.rollno');
    let dob = element('.date');
    let regname = /[a-zA-Z]$/
    let regroll = /[0-9]{7,}$/
    if(regname.test(name) && regroll.test(rollno) ){
        if(name == 'name'){
            alert('Enter valid name')
        }
        else{
            document.querySelector('#d').innerHTML = new Date(Date.parse(dob));

        }
    }
    else{
        if(!regname.test(name)){
            alert('Enter valid name')
        }
        else(
            alert('Enter valid rollno')
        )
    }
})
let element = (c)=>{
    return document.querySelector(c).value;
}
document.querySelector('form').addEventListener('click',()=>{
    document.querySelector('#d').innerHTML = ''

})
window.addEventListener('load',()=>{
    document.querySelector('form').reset()

})