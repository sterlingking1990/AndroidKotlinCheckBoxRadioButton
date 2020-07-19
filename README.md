# AndroidKotlinCheckBoxRadioButton

## Working with CheckBox and RadioButton

## Radio Button

###### Because radio button deals with choice input, it means a user is only allowed to select one among the options. Hence, it should be organized to respond as such.
###### Radio buttons are grouped in a RadioGroup. The RadioGroup makes it possible to enable only one option to be selected  among the various options in the group.
###### You can set the RadioGroup orientation to either horizontal or vertical as you would like to lay the radio buttons within it

###### In other to access the item selected in the radio group, you do this
`
val radioButtonSelected = radioGroup.checkedRadioButtonId
`

###### The returned id is then used to access the radio button view and can be further used to access the text of that particular radio button

<pre>
radioButtonView=findViewById<RadioButton>(radioButtonSelected)
radioButtonText=radioButtonView.text
</pre>

## CheckBox

###### The checkbox allows for multichoice items, because of this, it is not grouped within another parent View.
###### To access checked item, you do this

<pre>
isCheeseChecked=chkCheese.isChecked
val cheese=if(isCheeseChecked) "Cheese" else ""
</pre>
