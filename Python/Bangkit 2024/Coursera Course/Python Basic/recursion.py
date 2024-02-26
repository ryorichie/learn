
def factorial(n):
  print("Factorial called with " + str(n))
  if n < 2: # this stop it from returning less than zero
    print("Returning 1")
    return 1
  result = n * factorial(n-1)
  print("Returning " + str(result) + " for factorial of " + str(n))
  return result

factorial(999)

## recursion structure
# def recursive_function(parameters):
#     if base_case_condition(parameters):
#         return base_case_value
#     recursive_function(modified_parameters)