let currentInput = '';
let currentOperator = '';
let result = 0;

function appendToDisplay(value) {
    currentInput += value;
    document.getElementById('display').value = currentInput;
}

function clearDisplay() {
    currentInput = '';
    currentOperator = '';
    result = 0;
    document.getElementById('display').value = '';
}

function calculateResult() {
    if (currentInput !== '') {
        try {
            result = eval(currentInput);
            document.getElementById('display').value = result;
        } catch (error) {
            document.getElementById('display').value = 'Error';
        }
    }
    currentInput = '';
    currentOperator = '';
}
