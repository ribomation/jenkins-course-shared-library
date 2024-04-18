def call(Map opts) {
  opts = opts ?: [:]
  echo "Hello from my tiny jenkins shared library"
  echo "OPTIONS: ${opts}"
}

return this
