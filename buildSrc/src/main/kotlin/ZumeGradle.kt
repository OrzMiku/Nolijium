@Suppress("MemberVisibilityCanBePrivate")
object ZumeGradle {
	private var _version: String? = null
	var version: String = ""
		get() = _version!!
		set(value) {
			field = value
			if (value.isNotEmpty())
				_version = value
		}
}