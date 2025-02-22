package com.example.demo.controller;

import com.example.demo.model.Item;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@Validated
@RequestMapping("/api")
public class ItemController {
    private Map<Integer, Item> inventory = new HashMap<>();

    @GetMapping("/get-item/{itemId}")
    public ResponseEntity<Item> getItem(@PathVariable int itemId, @RequestParam Optional<String> name) {
        Item item = inventory.get(itemId);
        if (item == null || (name.isPresent() && !item.getName().equals(name.get()))) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(item, HttpStatus.OK);
    }

    @PostMapping("/create-item/{itemId}")
    public ResponseEntity<Item> createItem(@PathVariable int itemId, @RequestBody @Valid Item item) {
        if (inventory.containsKey(itemId)) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        inventory.put(itemId, item);
        return new ResponseEntity<>(item, HttpStatus.CREATED);
    }

    @PutMapping("/update-item/{itemId}")
    public ResponseEntity<Item> updateItem(@PathVariable int itemId, @RequestBody @Valid Item item) {
        if (!inventory.containsKey(itemId)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        inventory.put(itemId, item);
        return new ResponseEntity<>(item, HttpStatus.OK);
    }

    @DeleteMapping("/delete-item/{itemId}")
    public ResponseEntity<String> deleteItem(@PathVariable int itemId) {
        if (!inventory.containsKey(itemId)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        inventory.remove(itemId);
        return new ResponseEntity<>("Success: Item deleted!", HttpStatus.OK);
    }
}
