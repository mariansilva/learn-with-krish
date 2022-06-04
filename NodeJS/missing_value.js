function find_missing_val(number){
    let a = [];
    a.sort()
    let max = 30;
    let i = 21;
    let miss_val=[]
    for( i=21; i <= max; i++ ){
        if(number.indexOf(i) === -1){
         
         miss_val.push(i);
        }  
    }
    return miss_val;
 console.log(miss_val);  
};

    console.log(find_missing_val([21,25,29,28,22,24,27,26,30]));
    console.log(find_missing_val([25,29,28,22,23,24,27,26,30]));
    console.log(find_missing_val([21,25,29,28,22,23,24,27,26]));
