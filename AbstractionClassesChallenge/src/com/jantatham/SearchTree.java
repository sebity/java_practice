package com.jantatham;

/**
 * Created by jan on 19/03/17.
 */
public class SearchTree implements NodeList {
    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null) {
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if(comparison < 0) {
                if(currentItem.next() != null) {
                    currentItem = currentItem.next();
                }
                else {
                    currentItem.setNext(newItem);
                    return true;
                }
            }
            else if(comparison > 0) {
                if(currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                }
                else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            }
            else {
                System.out.println(newItem + " is already present");
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while(currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if(comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            }
            else if(comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            }
            else {
                // equal: we've found the item so remove it
                performRemoval(currentItem, parentItem);
                return true;
            }
        }

        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        // remove item from the tree
        if(item.next() == null) {
            // no right tree, so make the parent point to the left tree (which may be null)
            if(parent.next() == item) {
                parent.setNext(item.previous());
            }
            else if(parent.previous() == item) {
                parent.setPrevious(item.previous());
            }
            else {
                this.root = item.previous();
            }
        }
        else if (item.previous() == null) {
            // no left tree, so make parent point to the right tree (which may be null)
            if(parent.next() == item) {
                // item is right child of itsparent
                parent.setNext(item.next());
            }
            else if(parent.previous() ==  item) {
                // item is left child of its parent
                parent.setPrevious(item.next());
            }
            else {
                this.root = item.next();
            }
        }
        else {
            // neither left not right are null, deletion is now a lot trickier!
            // From the right sub-tree, find the smallest value (i.e., the leftmost)
            ListItem current = item.next();
            ListItem leftMostParent = item;
            while(current.previous() != null) {
                leftMostParent = current;
                current = current.previous();
            }

            // Now put the smallest value into out node to be deleted
            item.setValue(current.getValue());
            // and delete the smallest
            if(leftMostParent == item) {
                item.setNext(current.next());
            }
            else {
                leftMostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        // recursive method
        if(root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
