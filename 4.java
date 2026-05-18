let prices = [100, 200, 300];

// Создай новый массив, где каждая цена увеличена на 20%
let increasedPrices = prices.map(price => price * 1.2);
console.log(increasedPrices); // [120, 240, 360]

// Исходный массив не изменился
console.log("Исходные цены:", prices); // [100, 200, 300]
