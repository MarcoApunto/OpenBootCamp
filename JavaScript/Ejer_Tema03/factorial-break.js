let total = 10;
var i = total - 1;

while (total) {
	total *= i;
	i--;
	if (i <= 1)
		break;
}
console.log(total);