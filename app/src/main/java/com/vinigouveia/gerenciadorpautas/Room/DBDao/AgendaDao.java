package com.vinigouveia.gerenciadorpautas.Room.DBDao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.vinigouveia.gerenciadorpautas.Room.DBEntities.AgendaEntity;

import java.util.List;

@Dao
public interface AgendaDao {
    @Query("SELECT * FROM agendas WHERE authorEmail LIKE :userEmail")
    List<AgendaEntity> getAllAgendas(String userEmail);

    @Insert
    void insertAgenda(AgendaEntity agenda);

    @Update
    void updateStatus(AgendaEntity agenda);
}
