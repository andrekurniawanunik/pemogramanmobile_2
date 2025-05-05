package com.example.bottomnavigasi

import androidx.navigation.ActivityNavigator

sealed class Destination(val route: String, val icon: Int, val title: String){
    object Transaction: Destination(
        route="transaction",icon=R.drawable.baseline_account_balance_wallet_24,
        title="Transaction"
    )
    object Budgets: Destination(
        route="budget",icon=R.drawable.baseline_account_balance_wallet_24,
        title="Budget"
    )
    object Tasks:Destination(
        route="tasks",icon=R.drawable.baseline_add_task_24,
        title="Tasks"
    )
    object Settiings:Destination(
        route="settings",icon=R.drawable.baseline_settings_suggest_24,
        title="Settings"
    )
    companion object{
        val tolList= listOf(Transaction,Budgets,Tasks,Settiings)
    }
}