export default class Stack{
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
