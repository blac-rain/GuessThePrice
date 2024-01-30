# What Is The Idea?
a small program do find the nearest guess of a price from a group of people within a preset number of rounds

# What Should It Do?
## Begin
- prompt an input
    - maybe a window
    - maybe in console
- *maybe ask for number of people to set list max?*
- user may input names of people -> **save**
    - max number 10?
    - all names in 1 go or in different prompts?    
- ask for rounds to guess --> **save**

## Main
- show window for round 1
- ask for price --> **save**
- new window
- ask for guesses --> **save**
    - different prompts or 1?
- find nearest guess
- new window: show list of guesses with how far away
    - **save** places of all
    - place == points
    - least points == highest place
- show next round
- end of game: show winner (least points aka highest places overall)

# What Is Needed?
- input windows
    1. names of people
    2. num of rounds
- round ask windows
    1. price
    2. guesses --> show name with input field
- find nearest guess(es)
    - make list
    - save points to names
- round show window
    - show current guesses list
    - ask for next round
- *repeat until round end* --> for loop
- end window
    - show list of all guesses
    - show winner
    - ask for end or new round

## Variables
- list of names --> **array**, **string**
- num of rounds --> **integer**
- price to guess --> **double**
- guesses --> **array**, **double**
- points --> **array**, **integer**

# Future To Do
- custom icons in the windows
- add dialog when windows while playing are closed
    - confirm closing
    - show goodbye msg on confirm
- show error when no nothing is entered in all input windows
- maybe show error when names are not letter
- maybe convert all names 
    - first letter capitalized
    - complete lower case
- make player guesses question 1 window not different for each guess