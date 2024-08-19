function droite(){};
function gauche(){};
function ramasser(){};
function deposer(){};

for (let i = 1; i <= 10; i ++) {
    for (let j = 1; j <= i; j++) {
        droite();
    } ramasser();
    for (let j = 1; j <= i; j++) {
        gauche();
    } deposer();
}