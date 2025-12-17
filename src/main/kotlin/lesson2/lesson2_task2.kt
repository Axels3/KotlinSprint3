package org.example.lesson2

fun main() {
    val employeeCount: Int = 50
    val employeeSalary: Int = 30000
    val internCount: Int = 30
    val internSalary: Int = 20000

    val totalEmployeePayroll: Int = employeeCount * employeeSalary
    val totalPayrollWithInterns: Int = totalEmployeePayroll + (internCount * internSalary)
    val averageSalaryWithInterns: Int = (totalPayrollWithInterns.toDouble() / (employeeCount + internCount)).toInt()

    println("– Расходы на выплату зарплаты постоянных сотрудников: $totalEmployeePayroll")
    println("– Общие расходы по ЗП после прихода стажеров: $totalPayrollWithInterns")
    println("– Среднюю ЗП одного сотрудника после устройства стажеров: $averageSalaryWithInterns")
}