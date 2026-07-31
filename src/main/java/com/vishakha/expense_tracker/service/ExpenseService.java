package com.vishakha.expense_tracker.service;

import com.vishakha.expense_tracker.model.Expense;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExpenseService {

    private final List<Expense> expenses = new ArrayList<>();

    public Expense addExpense(Expense expense) {
        expenses.add(expense);
        return expense;
    }

    public List<Expense> getAllExpenses() {
        return expenses;
    }

    public List<Expense> getExpensesByCategory(String category) {
        List<Expense> result = new ArrayList<>();

        for (Expense expense : expenses) {
            if (expense.getCategory().equalsIgnoreCase(category)) {
                result.add(expense);
            }
        }

        return result;
    }

    public double getTotalExpenses() {
        double total = 0;

        for (Expense expense : expenses) {
            total += expense.getAmount();
        }

        return total;
    }

    public double getTotalByCategory(String category) {
        double total = 0;

        for (Expense expense : expenses) {
            if (expense.getCategory().equalsIgnoreCase(category)) {
                total += expense.getAmount();
            }
        }

        return total;
    }

    public String deleteExpense(Long id) {

        for (Expense expense : expenses) {
            if (expense.getId().equals(id)) {
                expenses.remove(expense);
                return "Expense Deleted Successfully";
            }
        }

        return "Expense Not Found";
    }
}