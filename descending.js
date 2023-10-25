const data = [14, 87, 42, 3, 65, 27];

data.sort(sortDescending);

function sortDescending(a, b) {
  return b - a;
}

console.log(data);
