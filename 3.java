let players = [
  { name: "Alex", level: 10 },
  { name: "Bob", level: 5 },
  { name: "Clara", level: 10 }
];

// Найди первого игрока с уровнем 10
let firstLevel10 = players.find(player => player.level === 10);
console.log("Первый игрок с уровнем 10:", firstLevel10); 
// { name: "Alex", level: 10 }

// Получи массив всех игроков с уровнем 10
let allLevel10 = players.filter(player => player.level === 10);
console.log("Все игроки с уровнем 10:", allLevel10);
// [{ name: "Alex", level: 10 }, { name: "Clara", level: 10 }]
