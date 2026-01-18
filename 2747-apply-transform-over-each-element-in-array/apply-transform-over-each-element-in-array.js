/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const arRes = [];
    for (let i=0;i<arr.length;i++){
        arRes.push(fn(arr[i],i));
    }
    return arRes;
};