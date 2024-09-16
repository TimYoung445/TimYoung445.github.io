let count = 0;

function increaseCount() {
    count += 1;
    document.getElementById('count').innerText = count;
}

function refreshImage() {
    const image = document.getElementById('random-image');
    image.src = `https://picsum.photos/200?random=${new Date().getTime()}`;
}

function moveSquare() {
    const slider = document.getElementById('slider');
    const square = document.getElementById('square');
    square.style.left = `${slider.value}%`;
}