# Notes Maker

A simple Java-based Notes Manager that allows users to write and read notes stored in a text file.
Used `FileWriter` to append notes and `BufferedReader` to read them line by line efficiently.
Handled file operations safely using try-with-resources and Java’s `AutoCloseable` feature.

### Features

* Write and save notes to a text file.

* Read and display all saved notes with line numbers.

* Automatically create a notes file if it doesn’t exist.

* Handle file read/write errors gracefully.

### Key Concepts Learnt

- `FileWriter` — for writing and appending data to files.

- `BufferedReader` — for reading text efficiently from files.

- **Try-with-Resources** — for automatic resource management.

- `AutoCloseable` — ensures files are closed safely without manual handling.