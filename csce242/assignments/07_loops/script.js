document.getElementById('drawButton').addEventListener('click', drawStars);

function drawStars() {
    const starCount = parseInt(document.getElementById('starCount').value);
    const errorMessage = document.getElementById('error');
    const canvas = document.getElementById('canvas');

    // Clear previous stars and error messages
    errorMessage.textContent = '';
    canvas.innerHTML = '';

    if (isNaN(starCount) || starCount <= 0) {
        errorMessage.textContent = 'Please enter a valid number greater than 0.';
        return;
    }

    for (let i = 0; i < starCount; i++) {
        createStar(i);
    }
}

function createStar(index) {
    const canvas = document.getElementById('canvas');
    const star = document.createElement('div');
    star.className = 'star';
    star.textContent = '*';

    // Random position within the canvas
    const x = Math.random() * (canvas.clientWidth - 24);
    const y = Math.random() * (canvas.clientHeight - 24);
    star.style.left = `${x}px`;
    star.style.top = `${y}px`;

    // Add click event to identify star
    star.addEventListener('click', () => {
        alert(`You clicked on star number: ${index + 1}`);
    });

    canvas.appendChild(star);
}