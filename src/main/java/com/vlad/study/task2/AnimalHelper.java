package com.vlad.study.task2;

import com.vlad.study.task2.entity.Animal;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class AnimalHelper {
    EntityManagerFactory emf;
    EntityManager em;

    public AnimalHelper() {
        emf = Persistence.createEntityManagerFactory("mohr");
        em = emf.createEntityManager();
    }
    public List<Animal> getAnimalsList(){
        em.getTransaction().begin();
        List<Animal> animalList = em.createQuery("From Animal animals").getResultList();
        em.getTransaction().commit();
        return animalList;
    }
    public void addAnimal(Animal animal){
        em.getTransaction().begin();
        em.persist(animal);
        em.getTransaction().commit();
    }
    public void removeAnimal(Animal animal){
        em.getTransaction().begin();
        em.remove(animal);
        em.getTransaction().commit();
    }
    public Animal getAnimalById(long id){
        em.getTransaction().begin();
        Animal animal = em.find(Animal.class, id);
        em.getTransaction().commit();
        return animal;
    }
    public void closeEntityManagerFactory(){
        em.close();
        emf.close();
    }
}
