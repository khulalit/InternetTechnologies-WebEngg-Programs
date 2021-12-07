let count = 0;
const can = document.querySelector('.img');
let timer = setInterval(animation, 1000);
console.log(getComputedStyle(can).right)
function animation() {
    if(parseInt(getComputedStyle(can).marginLeft)>1000 ){
        clearInterval(timer)
        can.style.transform = `rotatey(-180deg)`
        can.style.marginLeft = `0px`
    }
    else{
        can.style.marginLeft = `100%`
        console.log(getComputedStyle(can).marginLeft)
    }
    //can.style.marginLeft = `${count+=20}px`
}

