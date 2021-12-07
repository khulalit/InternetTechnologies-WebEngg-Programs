

//-------------------------------------------------main program starts=============================================
function swap(arr, first_Index, second_Index){
    var temp = arr[first_Index];
    arr[first_Index] = arr[second_Index];
    arr[second_Index] = temp;
}

function bubble_Sort(arr){

    var len = arr.length,
        i, j, stop;

    for (i=0; i < len; i++){
        for (j=0, stop=len-i; j < stop; j++){
            if (arr[j] > arr[j+1]){
                swap(arr, j, j+1);
            }
        }
    }

    return arr;
}
document.querySelector('#handlebutton').addEventListener('click',()=>{
    let arrarString = document.querySelector('#array_input').value;
    const valid = new RegExp('[[0-9,.]+[0-9]]*$')
    let array = [];
    let array_valid = [];
    if(valid.test(arrarString)){
        array = arrarString.split(',');
        array_valid = array.map((value)=>{
            return Number(value);
        })
        document.querySelector('#result').innerHTML = bubble_Sort(array_valid)
    }
    else{
        alert("enter valid input")
    }

    
        
})
//clear button handle


function handle_click() {
    document.querySelector('#array_input').value = ''
    console.log()
}
// reset
window.addEventListener('load',()=>{
    document.querySelector('#array_input').value = null;
})