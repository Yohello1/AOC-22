inputs = []

with open('input') as file:
    inputs = file.read().splitlines()

score = 0

win = {'A': 'Y', 'B': 'Z', 'C': 'X'}
lose = {'A': 'Z', 'B': 'X', 'C': 'Y'}
shape = {'X': 1, 'Y': 2, 'Z': 3}
elf_shape = {'A': 1, 'B': 2, 'C': 3}
for i in inputs:
    elf = i[0]
    me = i[2]
    if win[elf] == me:
        score+=shape[me]+6
    elif lose[elf] == me:
        score+=shape[me]
    else:
        score+=shape[me]+3
score=0
for i in inputs:
    elf = i[0]
    exp = i[2]
    if exp == 'X':
        score+=shape[lose[elf]]
    elif exp == 'Z':
        score+=shape[win[elf]]+6
    else:
        score+=elf_shape[elf]+3

print(score)