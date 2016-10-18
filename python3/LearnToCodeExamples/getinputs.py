operator_list = ['+', '-', '*', '/']

def getInputs():

    operator = None
    while operator not in operator_list:
        operator = input("Give me an operator\n")

    firstNumber = float(input("Give me the first number\n"))
    secondNumber = float(input("Give me the second number\n"))
    return operator, firstNumber, secondNumber

def processArguments():
    import sys
    operator = sys.argv[1]
    if operator not in operator_list:
        print("Wrong operator")
        return None, None, None

    firstNumber = float(sys.argv[2])
    secondNumber = float(sys.argv[3])
    return operator, firstNumber, secondNumber
