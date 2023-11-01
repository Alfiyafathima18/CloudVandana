function reverseWords(sentence) {
    var words = sentence.split(' ');
    for (var i = 0; i < words.length; i++) {
      words[i] = words[i].split('').reverse().join('');
    }
    return words.join(' ');
  }
  
  var inputSentence = "Happy Morning";
  var reversedSentence = reverseWords(inputSentence);
  console.log(reversedSentence);