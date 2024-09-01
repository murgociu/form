$('.form').addEventListener('submit', function(event) {
    // Get the input element by its name
    let sourceInput = this.querySelector('input[name="source"]');

    // Reverse the value of the input
    let reversedValue = sourceInput.value.split('').reverse().join('');

    // Set the reversed value back to the input
    sourceInput.value = reversedValue;
});
