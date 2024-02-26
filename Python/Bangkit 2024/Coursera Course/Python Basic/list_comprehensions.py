multiples = [x*7 for x in range(1,100)]
print(multiples)

languages = ["Python", "Perl", "Ruby", "Go", "Java", "C"]
lengths = [len(language) for language in languages]
print(lengths)

z = [x for x in range (0, 2000) if x % 3 == 0]
print