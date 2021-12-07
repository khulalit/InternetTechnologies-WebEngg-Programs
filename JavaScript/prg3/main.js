//importing stack js module
// import Stack from './stack.js'
class Stack{
    constructor(){
        this.array = [];
    }
    push(input){
        this.array.push(input);
        return input+' pushed'
    }
    pop(){
        if (this.array.length>0) {
            return this.array.pop()+' poped';
        } else {
            return "Stack underflow"
        }
    }
    display(){

        return this.array;
    }
}

//initailizing stack
const stack = new Stack();
console.log("stack is initailise ")

// preventing form from submitting (for precaution)
document.querySelector('#form').addEventListener('submit',(e)=>{
    e.preventDefault();
    e.stopPropagation();

})

//adding unload event
window.addEventListener('unload',()=>{
    document.querySelector('#form').reset();
    
})
// load event
window.addEventListener('load',()=>{
    document.querySelector('#input').focus()
})
//------------------------------------------

//------------------------------------------
// function to get value of the html element
function getElementValue(identifier) {
    return document.querySelector(identifier).value;
}
    // adding click event to push button
    document.querySelector('#push').addEventListener('click',()=>{
        
        let status = stack.push(getElementValue('#input'))
        // document.querySelector('span').innerText = status;
        // document.querySelector('#push').disabled = true;
        // setTimeout(() => {
        //     document.querySelector('span').innerText = '';
        //     document.querySelector('#push').disabled = false;
        // }, 2000);
        print(stack.display())
        console.log("in push"+stack.display())
        document.querySelector('#input').value = ''
        document.querySelector('#input').focus()
    })
    //adding click event to pop button
    document.querySelector('#pop').addEventListener('click',()=>{
        let status = stack.pop()
        document.querySelector('span').innerText = status;
        document.querySelector('#pop').disabled = true;
        setTimeout(() => {
            document.querySelector('span').innerText = '';
            document.querySelector('#pop').disabled = false;
        }, 1000);
        print(stack.display())
        document.querySelector('#input').focus()
    })

    // printing on html document
    function print(a) {
        document.querySelector('.stack').innerHTML = "";
        for(let i= a.length-1; i>=0;i--){
        document.querySelector('.stack').innerHTML += `<h2>${a[i]}</h2><hr style="background-color: white">` 
        }
    }
