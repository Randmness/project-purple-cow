package com.fearless.projectpurplecow.controller;

import com.fearless.projectpurplecow.item.Item;
import com.fearless.projectpurplecow.item.ItemNotFoundException;
import com.fearless.projectpurplecow.item.ItemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    private final ItemRepository repository;

    ItemController(ItemRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/items")
    public List<Item> retrieveAllItems() {
        return repository.findAll();
    }

    @PostMapping("/items")
    public void insertItems(@RequestBody List<Item> items) {
        repository.saveAll(items);
    }

    @DeleteMapping("/items")
    void deleteAllItems() {
        repository.deleteAll();
    }

    @GetMapping("/items/{id}")
    public Item retrieveItemById(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ItemNotFoundException(id));
    }

    @PutMapping("/items/{id}")
    public Item updateOrInsertItem(@PathVariable Long id, @RequestBody Item item) {
        return repository.findById(id).map(updateItem -> {
            updateItem.setName(item.getName());
            return repository.save(updateItem);
        }).orElseThrow(() -> new ItemNotFoundException(id));
    }

    @DeleteMapping("/items/{id}")
    public void deleteItem(@PathVariable Long id) {
        repository.delete(retrieveItemById(id));
    }

}
