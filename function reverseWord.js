function reverseWords(sentence) {
    var words = sentence.split(' ');

    var reversedWords = words.map(function(word) {
        return word.split('').reverse().join('');
    });

    var reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

var inputText = "This is a sunny day";
var reversedText = reverseWords(inputText);

console.log(reversedText); 
