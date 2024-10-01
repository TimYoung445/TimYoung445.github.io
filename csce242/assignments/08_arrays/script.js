const images = [
    {
        src: 'https://via.placeholder.com/150/0000FF/FFFFFF/?text=Image1',
        title: 'Image 1',
        description: 'This is the description for Image 1.'
    },
    {
        src: 'https://via.placeholder.com/150/FF0000/FFFFFF/?text=Image2',
        title: 'Image 2',
        description: 'This is the description for Image 2.'
    },
    {
        src: 'https://via.placeholder.com/150/00FF00/FFFFFF/?text=Image3',
        title: 'Image 3',
        description: 'This is the description for Image 3.'
    },
    {
        src: 'https://via.placeholder.com/150/FFFF00/FFFFFF/?text=Image4',
        title: 'Image 4',
        description: 'This is the description for Image 4.'
    },
    {
        src: 'https://via.placeholder.com/150/FF00FF/FFFFFF/?text=Image5',
        title: 'Image 5',
        description: 'This is the description for Image 5.'
    },
    {
        src: 'https://via.placeholder.com/150/00FFFF/FFFFFF/?text=Image6',
        title: 'Image 6',
        description: 'This is the description for Image 6.'
    }
];

const imageGallery = document.getElementById('image-gallery');
const imageTitle = document.getElementById('image-title');
const imageDescription = document.getElementById('image-description');

images.forEach(image => {
    const imgElement = document.createElement('img');
    imgElement.src = image.src;
    imgElement.alt = image.title;
    imgElement.addEventListener('click', () => {
        imageTitle.textContent = image.title;
        imageDescription.textContent = image.description;
    });
    imageGallery.appendChild(imgElement);
});