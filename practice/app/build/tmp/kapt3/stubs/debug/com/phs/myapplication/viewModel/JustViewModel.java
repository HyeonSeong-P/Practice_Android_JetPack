package com.phs.myapplication.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000b\u00a8\u0006\u0014"}, d2 = {"Lcom/phs/myapplication/viewModel/JustViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_assistData", "Lcom/phs/myapplication/SingleLiveEvent;", "", "_playerData", "Lcom/phs/myapplication/data/Player;", "assistData", "Landroidx/lifecycle/LiveData;", "getAssistData", "()Landroidx/lifecycle/LiveData;", "playerData", "getPlayerData", "incrementAssist", "", "incrementGoal", "plusAssist", "setPlayer", "player", "app_debug"})
public final class JustViewModel extends androidx.lifecycle.ViewModel {
    private final com.phs.myapplication.SingleLiveEvent<com.phs.myapplication.data.Player> _playerData = null;
    private final com.phs.myapplication.SingleLiveEvent<java.lang.Integer> _assistData = null;
    
    public JustViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.phs.myapplication.data.Player> getPlayerData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getAssistData() {
        return null;
    }
    
    public final void plusAssist() {
    }
    
    public final void setPlayer(@org.jetbrains.annotations.NotNull()
    com.phs.myapplication.data.Player player) {
    }
    
    public final void incrementGoal() {
    }
    
    public final void incrementAssist() {
    }
}