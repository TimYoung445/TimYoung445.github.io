function toggleMenu() {
    const menu = document.querySelector('.menu');
    if (menu.style.display === 'flex') {
        menu.style.display = 'none';
        document.querySelector('.toggle-menu').innerHTML = '&#9660;';
    } else {
        menu.style.display = 'flex';
        document.querySelector('.toggle-menu').innerHTML = '&#9650;';
    }
}

function showExercise(exercise) {
    document.getElementById('colorSlider').style.display = exercise === 'colorSlider' ? 'block' : 'none';
    document.getElementById('pictureChooser').style.display = exercise === 'pictureChooser' ? 'block' : 'none';
}

function updateColor(value) {
    const colorBox = document.getElementById('colorBox');
    const rgbValue = `rgb(${value}, 0, 0)`;
    colorBox.style.backgroundColor = rgbValue;

    let message;
    if (value < 85) {
        message = 'Low Red Value!';
    } else if (value < 170) {
        message = 'Medium Red Value!';
    } else {
        message = 'High Red Value!';
    }

    document.getElementById('colorMessage').innerText = message;
}

function showImage(size) {
    const image = document.getElementById('chosenImage');
    switch (size) {
        case 'small':
            image.src = 'https://picsum.photos/200/100';
            break;
        case 'medium':
            image.src = 'https://picsum.photos/400/200';
            break;
        case 'large':
            image.src = 'https://picsum.photos/800/400';
            break;
    }
    image.style.display = 'block';
}