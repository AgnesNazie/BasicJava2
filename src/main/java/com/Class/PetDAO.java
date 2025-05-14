package com.Class;

public interface PetDAO {
    void savePet(Pet pet);
    Pet findPetById(int id);
    void deletePet(int id);
}
