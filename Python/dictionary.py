# dictionary = changeable, unordered collection of unique key, fast because caching

capitals = {
    'Indonesia':'Jakarta',
    'USA':'Washington DC',
    'China':'Beijing',
    'Australia':'Sydney',
    'Japan':'Tokyo',
}

# print(capitals['China']), dangerous way
print(capitals.get('Germany'))
print(capitals.get('China'))
print(capitals.keys())
print(capitals.values())
print(capitals.items())

capitals.update({'German':'Berlin'}) # add value
capitals.update({'USA':'Texas'}) # update the value
capitals.pop('USA')
# capitals.clear() # clear dictionary


for kunci,benda in capitals.items():
    print(kunci, benda)