input_file = open("input", "r")

score = 0

for s in input_file.readlines():
    #Why did I construct this equation of all things
    score += ord(s[2]) - ord('W') + 3 * ((ord(s[2]) - ord(s[0]) + 2) % 3)

print("AOC 2022: day 2, part 1: {}".format(score))

input_file.close()