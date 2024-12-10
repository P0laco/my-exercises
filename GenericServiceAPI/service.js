class GenericService {
    constructor(serviceName) {
        this.serviceName = serviceName;
        this.items = [];
    }

    // Name of the service
    name() {
        return this.serviceName;
    }

    // Add an item to the service
    add(item) {
        if (!item || typeof item !== 'object') {
            throw new Error('Item must be an object');
        }
        this.items.push(item);
        return item;
    }

    // Remove an item by identifier (assuming the item has an `id` property)
    remove(id) {
        const index = this.items.findIndex(item => item.id === id);
        if (index === -1) {
            throw new Error(`Item with id ${id} not found`);
        }
        const removedItem = this.items.splice(index, 1)[0];
        return removedItem;
    }

    // Destroy the service, clear all items
    destroy() {
        this.items = [];
        return 'Service destroyed';
    }

    // Update an item by identifier (assuming the item has an `id` property)
    update(id, updatedItem) {
        const index = this.items.findIndex(item => item.id === id);
        if (index === -1) {
            throw new Error(`Item with id ${id} not found`);
        }
        this.items[index] = { ...this.items[index], ...updatedItem };
        return this.items[index];
    }

    // Get an item by identifier
    get(id) {
        const item = this.items.find(item => item.id === id);
        if (!item) {
            throw new Error(`Item with id ${id} not found`);
        }
        return item;
    }

    // List all items in the service
    list() {
        return this.items;
    }
}

// Example Usage:

const myService = new GenericService('MyService');

// Add items
const item1 = myService.add({ id: 1, name: 'Item 1' });
const item2 = myService.add({ id: 2, name: 'Item 2' });

// List all items
console.log(myService.list());

// Get a specific item by ID
console.log(myService.get(1));

// Update an item
console.log(myService.update(1, { name: 'Updated Item 1' }));

// Remove an item
console.log(myService.remove(2));

// List all items after removal
console.log(myService.list());

// Destroy the service (clear all items)
console.log(myService.destroy());

// List items after destruction
console.log(myService.list());
