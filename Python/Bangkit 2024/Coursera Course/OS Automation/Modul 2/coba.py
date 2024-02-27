import csv
def read_employees(csv_file_location):
        csv.register_dialect('empDialect', skipinitialspace=True, strict=True)
        employee_list = []
        with open(csv_file_location) as file:
                employee_file = csv.DictReader(open(csv_file_location), dialect = 'empDialect')
                for data in employee_file:
                        employee_list.append(data)
        return employee_list

def process_data(employee_list):
        departement_list = []
        departement_data = {}
        for employee_data in employee_list:
                departement_list.append(employee_data['Department'])
        for departement_name in set(departement_list):
                departement_data[departement_name] = departement_list.count(departement_name)
        return departement_data

def write_report(dictionary, report_file):
        with open(report_file, "w+") as f:
                for k in sorted(dictionary):
                        f.write(str(k)+':'+str(dictionary[k])+'\n')
                f.close()
        
employee_list = read_employees("data/employees.csv")
dictionary = process_data(employee_list)
write_report(dictionary, "data/report.txt")
print(dictionary)
